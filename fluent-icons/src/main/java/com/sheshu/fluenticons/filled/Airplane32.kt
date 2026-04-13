package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Airplane32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Airplane32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.758f, 2f)
            curveToRelative(-1.074f, 0f, -1.912f, 0.932f, -1.797f, 2f)
            lineToRelative(1.025f, 9.565f)
            lineToRelative(-3.8f, 0.165f)
            lineToRelative(-1.457f, -3.402f)
            curveTo(8.383f, 9.522f, 7.59f, 9f, 6.715f, 9f)
            curveTo(5.768f, 9f, 5f, 9.768f, 5f, 10.715f)
            verticalLineToRelative(3.24f)
            lineTo(3.975f, 14f)
            curveTo(2.882f, 14.014f, 2f, 14.904f, 2f, 16f)
            reflectiveCurveToRelative(0.882f, 1.986f, 1.975f, 2f)
            lineTo(5f, 18.044f)
            verticalLineToRelative(3.241f)
            curveTo(5f, 22.232f, 5.768f, 23f, 6.715f, 23f)
            curveToRelative(0.876f, 0f, 1.668f, -0.522f, 2.014f, -1.328f)
            lineToRelative(1.458f, -3.402f)
            lineToRelative(3.799f, 0.165f)
            lineTo(12.96f, 28f)
            curveToRelative(-0.115f, 1.068f, 0.723f, 2f, 1.797f, 2f)
            curveToRelative(0.938f, 0f, 1.786f, -0.56f, 2.156f, -1.422f)
            lineToRelative(4.214f, -9.832f)
            curveTo(23.079f, 18.83f, 25.047f, 19f, 27f, 19f)
            curveToRelative(1.657f, 0f, 3f, -1.343f, 3f, -3f)
            reflectiveCurveToRelative(-1.343f, -3f, -3f, -3f)
            curveToRelative(-1.953f, 0f, -3.92f, 0.17f, -5.872f, 0.254f)
            lineToRelative(-4.214f, -9.832f)
            curveTo(16.544f, 2.559f, 15.696f, 2f, 14.758f, 2f)
            close()
        }
    }.build()
}
