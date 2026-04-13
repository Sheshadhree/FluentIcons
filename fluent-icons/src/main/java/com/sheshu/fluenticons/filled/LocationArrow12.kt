package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrow12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.64f, 1.069f)
            curveToRelative(0.808f, -0.311f, 1.603f, 0.484f, 1.292f, 1.292f)
            lineToRelative(-3.076f, 7.997f)
            curveToRelative(-0.349f, 0.906f, -1.654f, 0.835f, -1.9f, -0.104f)
            lineToRelative(-0.803f, -3.05f)
            curveTo(5.107f, 7.03f, 4.97f, 6.894f, 4.796f, 6.848f)
            lineToRelative(-3.05f, -0.803f)
            curveToRelative(-0.938f, -0.247f, -1.01f, -1.552f, -0.104f, -1.9f)
            lineTo(9.64f, 1.069f)
            close()
        }
    }.build()
}
