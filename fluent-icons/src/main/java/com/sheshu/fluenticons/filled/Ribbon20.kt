package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Ribbon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Ribbon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveToRelative(-6f, 7f)
            curveToRelative(1.487f, 0f, 2.866f, -0.464f, 4f, -1.255f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.187f, -0.105f, 0.359f, -0.271f, 0.444f)
            curveToRelative(-0.167f, 0.086f, -0.367f, 0.072f, -0.52f, -0.037f)
            lineTo(10f, 16f)
            lineToRelative(-3.21f, 1.907f)
            curveToRelative(-0.152f, 0.108f, -0.352f, 0.123f, -0.519f, 0.037f)
            curveTo(6.105f, 17.86f, 6f, 17.687f, 6f, 17.5f)
            verticalLineToRelative(-3.755f)
            curveTo(7.134f, 14.536f, 8.513f, 15f, 10f, 15f)
            close()
        }
    }.build()
}
