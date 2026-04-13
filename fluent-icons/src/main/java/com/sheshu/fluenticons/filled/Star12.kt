package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Star12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Star12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.284f, 1.546f)
            curveToRelative(0.293f, -0.595f, 1.14f, -0.595f, 1.434f, 0f)
            lineTo(7.83f, 3.798f)
            lineToRelative(2.486f, 0.361f)
            curveToRelative(0.656f, 0.096f, 0.918f, 0.902f, 0.443f, 1.365f)
            lineTo(8.96f, 7.277f)
            lineToRelative(0.425f, 2.476f)
            curveToRelative(0.112f, 0.654f, -0.574f, 1.152f, -1.16f, 0.844f)
            lineTo(6f, 9.427f)
            lineToRelative(-2.224f, 1.17f)
            curveToRelative(-0.587f, 0.308f, -1.272f, -0.19f, -1.16f, -0.844f)
            lineTo(3.04f, 7.277f)
            lineTo(1.243f, 5.524f)
            curveTo(0.767f, 5.06f, 1.03f, 4.254f, 1.685f, 4.159f)
            lineTo(4.172f, 3.8f)
            lineToRelative(1.112f, -2.253f)
            close()
        }
    }.build()
}
