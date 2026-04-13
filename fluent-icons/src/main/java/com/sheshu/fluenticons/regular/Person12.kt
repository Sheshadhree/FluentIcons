package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Person12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Person12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 1f)
            curveTo(4.895f, 1f, 4f, 1.895f, 4f, 3f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveTo(5f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            close()
            moveToRelative(3.5f, 3f)
            horizontalLineToRelative(-5f)
            curveTo(2.672f, 6f, 2f, 6.672f, 2f, 7.5f)
            curveToRelative(0f, 1.116f, 0.459f, 2.01f, 1.212f, 2.615f)
            curveTo(3.953f, 10.71f, 4.947f, 11f, 6f, 11f)
            curveToRelative(1.053f, 0f, 2.047f, -0.29f, 2.788f, -0.885f)
            curveTo(9.54f, 9.51f, 10f, 8.616f, 10f, 7.5f)
            curveTo(10f, 6.672f, 9.328f, 6f, 8.5f, 6f)
            close()
            moveToRelative(-5f, 1f)
            horizontalLineToRelative(5f)
            curveTo(8.776f, 7f, 9f, 7.224f, 9f, 7.5f)
            curveToRelative(0f, 0.817f, -0.325f, 1.423f, -0.838f, 1.835f)
            curveTo(7.636f, 9.757f, 6.88f, 10f, 6f, 10f)
            curveToRelative(-0.88f, 0f, -1.636f, -0.243f, -2.162f, -0.665f)
            curveTo(3.324f, 8.923f, 3f, 8.317f, 3f, 7.5f)
            curveTo(3f, 7.224f, 3.224f, 7f, 3.5f, 7f)
            close()
        }
    }.build()
}
