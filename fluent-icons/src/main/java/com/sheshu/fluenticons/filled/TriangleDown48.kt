package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TriangleDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TriangleDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(27.528f, 40.772f)
            curveToRelative(-1.617f, 2.99f, -5.915f, 2.966f, -7.499f, -0.041f)
            lineTo(4.495f, 11.229f)
            curveTo(3.005f, 8.4f, 5.057f, 5f, 8.255f, 5f)
            horizontalLineToRelative(31.488f)
            curveToRelative(3.22f, 0f, 5.27f, 3.44f, 3.739f, 6.272f)
            lineToRelative(-15.954f, 29.5f)
            close()
        }
    }.build()
}
