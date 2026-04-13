package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DocumentRibbon16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentRibbon16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 1f)
            curveTo(3.895f, 1f, 3f, 1.895f, 3f, 3f)
            verticalLineToRelative(2.126f)
            curveTo(3.32f, 5.043f, 3.655f, 5f, 4f, 5f)
            verticalLineTo(3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2.5f)
            curveTo(8f, 5.328f, 8.672f, 6f, 9.5f, 6f)
            horizontalLineTo(12f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(7f)
            verticalLineToRelative(0.75f)
            curveToRelative(0f, 0.086f, -0.008f, 0.17f, -0.024f, 0.25f)
            horizontalLineTo(11f)
            curveToRelative(1.105f, 0f, 2f, -0.896f, 2f, -2f)
            verticalLineTo(5.413f)
            curveToRelative(0f, -0.398f, -0.158f, -0.78f, -0.44f, -1.06f)
            lineTo(9.647f, 1.438f)
            curveTo(9.367f, 1.158f, 8.984f, 1f, 8.586f, 1f)
            horizontalLineTo(5f)
            close()
            moveToRelative(6.793f, 4f)
            horizontalLineTo(9.5f)
            curveTo(9.224f, 5f, 9f, 4.776f, 9f, 4.5f)
            verticalLineTo(2.207f)
            lineTo(11.793f, 5f)
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
