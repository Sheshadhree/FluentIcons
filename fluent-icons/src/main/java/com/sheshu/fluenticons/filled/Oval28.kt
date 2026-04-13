package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Oval28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Oval28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 14f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            horizontalLineToRelative(6f)
            curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
            reflectiveCurveToRelative(-4.03f, 9f, -9f, 9f)
            horizontalLineToRelative(-6f)
            curveToRelative(-4.97f, 0f, -9f, -4.03f, -9f, -9f)
            close()
        }
    }.build()
}
