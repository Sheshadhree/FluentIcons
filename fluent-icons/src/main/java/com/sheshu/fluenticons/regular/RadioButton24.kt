package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.RadioButton24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RadioButton24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 22.002f)
            curveToRelative(5.524f, 0f, 10.002f, -4.478f, 10.002f, -10.001f)
            curveToRelative(0f, -5.524f, -4.478f, -10.002f, -10.002f, -10.002f)
            curveToRelative(-5.524f, 0f, -10.002f, 4.478f, -10.002f, 10.002f)
            curveToRelative(0f, 5.523f, 4.478f, 10.001f, 10.002f, 10.001f)
            close()
            moveToRelative(0f, -1.5f)
            curveToRelative(-4.695f, 0f, -8.502f, -3.806f, -8.502f, -8.501f)
            curveToRelative(0f, -4.696f, 3.807f, -8.502f, 8.502f, -8.502f)
            reflectiveCurveToRelative(8.502f, 3.806f, 8.502f, 8.502f)
            curveToRelative(0f, 4.695f, -3.807f, 8.501f, -8.502f, 8.501f)
            close()
        }
    }.build()
}
