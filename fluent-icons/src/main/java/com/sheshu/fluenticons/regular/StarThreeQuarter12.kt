package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarThreeQuarter12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarThreeQuarter12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.718f, 1.546f)
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
            curveToRelative(0.293f, -0.595f, 1.14f, -0.595f, 1.434f, 0f)
            close()
            moveTo(7f, 8.823f)
            lineToRelative(1.331f, 0.7f)
            lineToRelative(-0.374f, -2.18f)
            curveToRelative(-0.045f, -0.26f, 0.042f, -0.525f, 0.23f, -0.708f)
            lineTo(9.771f, 5.09f)
            lineTo(7.582f, 4.773f)
            curveTo(7.336f, 4.737f, 7.122f, 4.589f, 7f, 4.373f)
            verticalLineToRelative(4.45f)
            close()
        }
    }.build()
}
