package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentRibbon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentRibbon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            verticalLineToRelative(4.5f)
            curveTo(10f, 7.328f, 10.672f, 8f, 11.5f, 8f)
            horizontalLineTo(16f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2.355f)
            curveTo(8.622f, 14.94f, 9f, 14.014f, 9f, 13f)
            curveToRelative(0f, -2.209f, -1.79f, -4f, -4f, -4f)
            curveToRelative(-0.345f, 0f, -0.68f, 0.044f, -1f, 0.127f)
            verticalLineTo(3.5f)
            curveTo(4f, 2.67f, 4.672f, 2f, 5.5f, 2f)
            horizontalLineTo(10f)
            close()
            moveToRelative(1f, 0.25f)
            verticalLineTo(6.5f)
            curveTo(11f, 6.776f, 11.224f, 7f, 11.5f, 7f)
            horizontalLineToRelative(4.25f)
            lineTo(11f, 2.25f)
            close()
            moveTo(8f, 13f)
            curveToRelative(0f, 1.656f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.344f, -3f, -3f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            close()
            moveToRelative(-1f, 3.464f)
            curveTo(6.412f, 16.804f, 5.729f, 17f, 5f, 17f)
            curveToRelative(-0.729f, 0f, -1.412f, -0.194f, -2f, -0.535f)
            verticalLineToRelative(2.286f)
            curveToRelative(0f, 0.194f, 0.211f, 0.314f, 0.378f, 0.215f)
            lineTo(5f, 17.998f)
            lineToRelative(1.622f, 0.966f)
            curveTo(6.79f, 19.064f, 7f, 18.944f, 7f, 18.75f)
            verticalLineToRelative(-2.286f)
            close()
        }
    }.build()
}
