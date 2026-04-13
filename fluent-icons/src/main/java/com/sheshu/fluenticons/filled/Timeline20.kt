package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Timeline20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Timeline20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 3f)
            curveTo(2.672f, 3f, 2f, 3.672f, 2f, 4.5f)
            verticalLineToRelative(4f)
            curveTo(2f, 9.328f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveTo(14f, 3.672f, 13.328f, 3f, 12.5f, 3f)
            horizontalLineToRelative(-9f)
            close()
            moveToRelative(0f, 8f)
            curveTo(2.672f, 11f, 2f, 11.672f, 2f, 12.5f)
            verticalLineToRelative(4f)
            curveTo(2f, 17.328f, 2.672f, 18f, 3.5f, 18f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(17f, 12.437f)
            curveToRelative(-0.16f, 0.041f, -0.327f, 0.063f, -0.5f, 0.063f)
            reflectiveCurveToRelative(-0.34f, -0.022f, -0.5f, -0.063f)
            curveToRelative(-0.863f, -0.222f, -1.5f, -1.005f, -1.5f, -1.937f)
            curveToRelative(0f, -0.932f, 0.637f, -1.715f, 1.5f, -1.937f)
            curveToRelative(0.16f, -0.041f, 0.327f, -0.063f, 0.5f, -0.063f)
            reflectiveCurveToRelative(0.34f, 0.022f, 0.5f, 0.063f)
            curveToRelative(0.863f, 0.222f, 1.5f, 1.005f, 1.5f, 1.937f)
            curveToRelative(0f, 0.932f, -0.638f, 1.715f, -1.5f, 1.937f)
            close()
            moveTo(16.5f, 3f)
            curveTo(16.776f, 3f, 17f, 3.224f, 17f, 3.5f)
            verticalLineToRelative(4.042f)
            curveTo(16.837f, 7.514f, 16.67f, 7.5f, 16.5f, 7.5f)
            curveToRelative(-0.17f, 0f, -0.337f, 0.014f, -0.5f, 0.042f)
            verticalLineTo(3.5f)
            curveTo(16f, 3.224f, 16.224f, 3f, 16.5f, 3f)
            close()
            moveToRelative(0f, 10.5f)
            curveToRelative(-0.17f, 0f, -0.337f, -0.014f, -0.5f, -0.041f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-4.041f)
            curveToRelative(-0.163f, 0.027f, -0.33f, 0.041f, -0.5f, 0.041f)
            close()
        }
    }.build()
}
