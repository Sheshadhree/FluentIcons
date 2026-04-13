package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentRibbon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentRibbon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            verticalLineToRelative(3.5f)
            curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
            horizontalLineTo(13f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(6.976f)
            curveTo(6.992f, 14.92f, 7f, 14.835f, 7f, 14.75f)
            verticalLineToRelative(-3.105f)
            curveTo(7.622f, 10.94f, 8f, 10.014f, 8f, 9f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            curveToRelative(-0.345f, 0f, -0.68f, 0.043f, -1f, 0.126f)
            verticalLineTo(2.5f)
            curveTo(3f, 1.67f, 3.672f, 1f, 4.5f, 1f)
            horizontalLineTo(8f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(4.5f)
            curveTo(9f, 4.776f, 9.224f, 5f, 9.5f, 5f)
            horizontalLineToRelative(3.25f)
            lineTo(9f, 1.25f)
            close()
            moveTo(7f, 9f)
            curveToRelative(0f, 1.656f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.344f, -3f, -3f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(-1f, 3.464f)
            curveTo(5.412f, 12.804f, 4.729f, 13f, 4f, 13f)
            curveToRelative(-0.729f, 0f, -1.412f, -0.194f, -2f, -0.535f)
            verticalLineToRelative(2.286f)
            curveToRelative(0f, 0.194f, 0.211f, 0.314f, 0.378f, 0.214f)
            lineTo(4f, 14f)
            lineToRelative(1.622f, 0.965f)
            curveTo(5.79f, 15.064f, 6f, 14.944f, 6f, 14.75f)
            verticalLineToRelative(-2.286f)
            close()
        }
    }.build()
}
