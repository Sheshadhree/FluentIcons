package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonFeedback16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonFeedback16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 1.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.552f, 0.447f, 1f, 1f, 1f)
            verticalLineTo(7f)
            lineToRelative(1.8f, -1.5f)
            horizontalLineToRelative(2.2f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(5f, 4f)
            curveTo(3.895f, 4f, 3f, 4.895f, 3f, 6f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(2.5f, 5f)
            horizontalLineToRelative(-5f)
            curveTo(1.672f, 9f, 1f, 9.672f, 1f, 10.5f)
            curveToRelative(0f, 1.116f, 0.459f, 2.01f, 1.212f, 2.615f)
            curveTo(2.953f, 13.71f, 3.947f, 14f, 5f, 14f)
            curveToRelative(1.053f, 0f, 2.047f, -0.29f, 2.788f, -0.885f)
            curveTo(8.54f, 12.51f, 9f, 11.616f, 9f, 10.5f)
            curveTo(9f, 9.672f, 8.328f, 9f, 7.5f, 9f)
            close()
        }
    }.build()
}
