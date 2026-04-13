package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Warning24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Warning24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 17f)
            curveToRelative(0f, -0.552f, -0.448f, -0.999f, -1f, -0.999f)
            curveToRelative(-0.55f, 0f, -0.998f, 0.447f, -0.998f, 0.999f)
            reflectiveCurveToRelative(0.447f, 0.999f, 0.999f, 0.999f)
            curveToRelative(0.551f, 0f, 0.998f, -0.447f, 0.998f, -0.999f)
            close()
            moveToRelative(-0.26f, -7.853f)
            curveToRelative(-0.05f, -0.366f, -0.364f, -0.648f, -0.744f, -0.648f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.749f, 0.75f)
            lineToRelative(0.004f, 4.502f)
            lineToRelative(0.007f, 0.102f)
            curveToRelative(0.05f, 0.366f, 0.364f, 0.648f, 0.743f, 0.648f)
            curveToRelative(0.414f, 0f, 0.75f, -0.337f, 0.75f, -0.75f)
            lineToRelative(-0.004f, -4.502f)
            lineToRelative(-0.007f, -0.102f)
            close()
            moveToRelative(1.23f, -5.488f)
            curveToRelative(-0.857f, -1.548f, -3.082f, -1.548f, -3.938f, 0f)
            lineTo(2.286f, 17.66f)
            curveTo(1.456f, 19.16f, 2.541f, 21f, 4.256f, 21f)
            horizontalLineToRelative(15.49f)
            curveToRelative(1.714f, 0f, 2.799f, -1.84f, 1.969f, -3.34f)
            lineToRelative(-7.746f, -14f)
            close()
            moveToRelative(-2.626f, 0.726f)
            curveToRelative(0.286f, -0.516f, 1.027f, -0.516f, 1.313f, 0f)
            lineToRelative(7.745f, 14.002f)
            curveToRelative(0.277f, 0.5f, -0.085f, 1.113f, -0.656f, 1.113f)
            horizontalLineTo(4.256f)
            curveToRelative(-0.572f, 0f, -0.934f, -0.614f, -0.657f, -1.113f)
            lineToRelative(7.745f, -14.002f)
            close()
        }
    }.build()
}
