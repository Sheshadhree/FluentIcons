package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChevronDown48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChevronDown48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.366f, 16.116f)
            curveToRelative(-0.488f, 0.488f, -0.488f, 1.28f, 0f, 1.768f)
            lineToRelative(14.75f, 14.75f)
            curveToRelative(0.488f, 0.488f, 1.28f, 0.488f, 1.768f, 0f)
            lineToRelative(14.75f, -14.75f)
            curveToRelative(0.488f, -0.488f, 0.488f, -1.28f, 0f, -1.768f)
            reflectiveCurveToRelative(-1.28f, -0.488f, -1.768f, 0f)
            lineTo(24f, 29.982f)
            lineTo(10.134f, 16.116f)
            curveToRelative(-0.488f, -0.488f, -1.28f, -0.488f, -1.768f, 0f)
            close()
        }
    }.build()
}
