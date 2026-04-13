package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PresenceBusy24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PresenceBusy24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 12f)
            curveToRelative(0f, 6.627f, -5.373f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.627f, 0f, 12f)
            reflectiveCurveTo(5.373f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            close()
        }
    }.build()
}
