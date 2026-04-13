package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowUndo16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowUndo16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 2.5f)
            curveTo(3f, 2.224f, 3.224f, 2f, 3.5f, 2f)
            reflectiveCurveTo(4f, 2.224f, 4f, 2.5f)
            verticalLineToRelative(3.843f)
            lineToRelative(3.171f, -3.171f)
            curveToRelative(1.562f, -1.563f, 4.095f, -1.563f, 5.657f, 0f)
            curveToRelative(1.562f, 1.562f, 1.562f, 4.094f, 0f, 5.656f)
            lineToRelative(-5.025f, 5.026f)
            curveToRelative(-0.196f, 0.195f, -0.512f, 0.195f, -0.707f, 0f)
            curveToRelative(-0.196f, -0.196f, -0.196f, -0.512f, 0f, -0.708f)
            lineToRelative(5.025f, -5.025f)
            curveToRelative(1.171f, -1.171f, 1.171f, -3.07f, 0f, -4.242f)
            curveToRelative(-1.172f, -1.172f, -3.071f, -1.172f, -4.243f, 0f)
            lineTo(4.757f, 7f)
            horizontalLineTo(8.5f)
            curveTo(8.776f, 7f, 9f, 7.224f, 9f, 7.5f)
            reflectiveCurveTo(8.776f, 8f, 8.5f, 8f)
            horizontalLineTo(3.6f)
            curveTo(3.269f, 8f, 3f, 7.731f, 3f, 7.4f)
            verticalLineTo(2.5f)
            close()
        }
    }.build()
}
