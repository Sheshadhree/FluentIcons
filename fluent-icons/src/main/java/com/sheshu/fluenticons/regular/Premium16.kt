package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Premium16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Premium16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(3.31f, 2f, 3.138f, 2.107f, 3.053f, 2.276f)
            lineToRelative(-2f, 4f)
            curveToRelative(-0.088f, 0.176f, -0.065f, 0.387f, 0.059f, 0.54f)
            lineToRelative(6.5f, 8f)
            curveTo(7.707f, 14.931f, 7.849f, 15f, 8f, 15f)
            curveToRelative(0.15f, 0f, 0.293f, -0.068f, 0.388f, -0.185f)
            lineToRelative(6.5f, -8f)
            curveToRelative(0.124f, -0.152f, 0.147f, -0.363f, 0.06f, -0.539f)
            lineToRelative(-2f, -4f)
            curveTo(12.862f, 2.107f, 12.688f, 2f, 12.5f, 2f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(2.309f, 6f)
            lineToRelative(1.5f, -3f)
            horizontalLineToRelative(2.05f)
            lineTo(5.11f, 6f)
            horizontalLineToRelative(-2.8f)
            close()
            moveTo(2.55f, 7f)
            horizontalLineToRelative(2.583f)
            lineToRelative(1.613f, 5.164f)
            lineTo(2.55f, 7f)
            close()
            moveToRelative(3.63f, 0f)
            horizontalLineToRelative(3.64f)
            lineTo(8f, 12.823f)
            lineTo(6.18f, 7f)
            close()
            moveToRelative(4.688f, 0f)
            horizontalLineToRelative(2.582f)
            lineToRelative(-4.196f, 5.164f)
            lineTo(10.868f, 7f)
            close()
            moveToRelative(2.823f, -1f)
            horizontalLineToRelative(-2.8f)
            lineToRelative(-0.75f, -3f)
            horizontalLineToRelative(2.05f)
            lineToRelative(1.5f, 3f)
            close()
            moveTo(9.86f, 6f)
            horizontalLineTo(6.14f)
            lineToRelative(0.75f, -3f)
            horizontalLineToRelative(2.22f)
            lineToRelative(0.75f, 3f)
            close()
        }
    }.build()
}
