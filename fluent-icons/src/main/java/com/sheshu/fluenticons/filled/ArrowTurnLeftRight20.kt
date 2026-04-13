package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowTurnLeftRight20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowTurnLeftRight20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.53f, 15.447f)
            curveToRelative(0.194f, -0.078f, 0.347f, -0.233f, 0.422f, -0.43f)
            curveToRelative(0.074f, -0.195f, 0.063f, -0.414f, -0.03f, -0.601f)
            lineToRelative(-2.5f, -5.001f)
            curveToRelative(-0.186f, -0.37f, -0.636f, -0.521f, -1.007f, -0.336f)
            curveToRelative(-0.37f, 0.185f, -0.52f, 0.636f, -0.335f, 1.006f)
            lineToRelative(1.62f, 3.245f)
            lineToRelative(-9.817f, -4.32f)
            lineToRelative(10.663f, -4.57f)
            curveToRelative(0.38f, -0.163f, 0.557f, -0.603f, 0.394f, -0.984f)
            curveToRelative(-0.163f, -0.381f, -0.604f, -0.557f, -0.985f, -0.394f)
            lineTo(2.764f, 7.857f)
            curveTo(1.759f, 8.287f, 1.752f, 9.71f, 2.752f, 10.15f)
            lineToRelative(10.467f, 4.606f)
            lineToRelative(-3.247f, 1.298f)
            curveToRelative(-0.384f, 0.153f, -0.572f, 0.59f, -0.418f, 0.974f)
            curveToRelative(0.154f, 0.385f, 0.59f, 0.572f, 0.975f, 0.418f)
            lineToRelative(5f, -1.999f)
            close()
        }
    }.build()
}
