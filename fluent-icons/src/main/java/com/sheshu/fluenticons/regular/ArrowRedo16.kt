package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRedo16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRedo16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 2.5f)
            curveTo(13f, 2.224f, 12.775f, 2f, 12.5f, 2f)
            curveTo(12.223f, 2f, 12f, 2.224f, 12f, 2.5f)
            verticalLineToRelative(3.843f)
            lineTo(8.827f, 3.172f)
            curveToRelative(-1.562f, -1.563f, -4.094f, -1.563f, -5.656f, 0f)
            curveToRelative(-1.563f, 1.562f, -1.563f, 4.094f, 0f, 5.656f)
            lineToRelative(5.025f, 5.026f)
            curveToRelative(0.195f, 0.195f, 0.512f, 0.195f, 0.707f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineTo(3.879f, 8.121f)
            curveToRelative(-1.172f, -1.171f, -1.172f, -3.07f, 0f, -4.242f)
            curveToRelative(1.171f, -1.172f, 3.07f, -1.172f, 4.242f, 0f)
            lineTo(11.243f, 7f)
            horizontalLineTo(7.499f)
            curveTo(7.224f, 7f, 7f, 7.224f, 7f, 7.5f)
            reflectiveCurveTo(7.224f, 8f, 7.5f, 8f)
            horizontalLineToRelative(4.9f)
            curveTo(12.732f, 8f, 13f, 7.731f, 13f, 7.4f)
            verticalLineTo(2.5f)
            close()
        }
    }.build()
}
