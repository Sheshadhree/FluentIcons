package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Record32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Record32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveTo(8.268f, 2f, 2f, 8.268f, 2f, 16f)
            reflectiveCurveToRelative(6.268f, 14f, 14f, 14f)
            reflectiveCurveToRelative(14f, -6.268f, 14f, -14f)
            reflectiveCurveTo(23.732f, 2f, 16f, 2f)
            close()
            moveToRelative(0f, 23f)
            curveToRelative(-4.97f, 0f, -9f, -4.03f, -9f, -9f)
            reflectiveCurveToRelative(4.03f, -9f, 9f, -9f)
            reflectiveCurveToRelative(9f, 4.03f, 9f, 9f)
            reflectiveCurveToRelative(-4.03f, 9f, -9f, 9f)
            close()
        }
    }.build()
}
