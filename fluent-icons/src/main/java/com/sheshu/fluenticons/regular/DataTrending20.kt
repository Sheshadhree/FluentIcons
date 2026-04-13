package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataTrending20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataTrending20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.5f, 2f)
            curveTo(2.776f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(13f)
            curveTo(3f, 16.328f, 3.672f, 17f, 4.5f, 17f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(17.776f, 18f, 17.5f, 18f)
            horizontalLineToRelative(-13f)
            curveTo(3.12f, 18f, 2f, 16.88f, 2f, 15.5f)
            verticalLineToRelative(-13f)
            curveTo(2f, 2.224f, 2.224f, 2f, 2.5f, 2f)
            close()
            moveTo(12f, 5.5f)
            curveTo(12f, 5.224f, 12.224f, 5f, 12.5f, 5f)
            horizontalLineToRelative(4f)
            curveTo(16.776f, 5f, 17f, 5.224f, 17f, 5.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(16f, 9.776f, 16f, 9.5f)
            verticalLineTo(6.707f)
            lineToRelative(-4.646f, 4.647f)
            curveTo(11.26f, 11.447f, 11.133f, 11.5f, 11f, 11.5f)
            curveToRelative(-0.133f, 0f, -0.26f, -0.053f, -0.354f, -0.146f)
            lineTo(9f, 9.707f)
            lineToRelative(-3.146f, 3.147f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, -0.196f, -0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(3.5f, -3.5f)
            curveTo(8.74f, 8.553f, 8.867f, 8.5f, 9f, 8.5f)
            curveToRelative(0.133f, 0f, 0.26f, 0.053f, 0.354f, 0.146f)
            lineTo(11f, 10.293f)
            lineTo(15.293f, 6f)
            horizontalLineTo(12.5f)
            curveTo(12.224f, 6f, 12f, 5.776f, 12f, 5.5f)
            close()
        }
    }.build()
}
