package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceBusy20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceBusy20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 10f)
            curveToRelative(0f, 5.523f, -4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(0f, 15.523f, 0f, 10f)
            reflectiveCurveTo(4.477f, 0f, 10f, 0f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            close()
        }
    }.build()
}
