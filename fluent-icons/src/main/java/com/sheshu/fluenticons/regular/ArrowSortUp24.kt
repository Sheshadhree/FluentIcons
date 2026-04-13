package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowSortUp24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowSortUp24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.72f, 8.715f)
            lineToRelative(4.494f, -4.495f)
            curveToRelative(0.266f, -0.266f, 0.683f, -0.29f, 0.976f, -0.073f)
            lineToRelative(0.085f, 0.072f)
            lineToRelative(4.504f, 4.495f)
            curveToRelative(0.294f, 0.293f, 0.294f, 0.768f, 0.002f, 1.06f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.292f, -0.977f, 0.075f)
            lineTo(15.72f, 9.775f)
            lineToRelative(-3.223f, -3.217f)
            verticalLineToRelative(12.696f)
            curveToRelative(0f, 0.38f, -0.281f, 0.693f, -0.648f, 0.743f)
            lineToRelative(-0.101f, 0.007f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.282f, -0.743f, -0.648f)
            lineToRelative(-0.007f, -0.102f)
            lineToRelative(-0.001f, -12.698f)
            lineTo(7.78f, 9.775f)
            curveToRelative(-0.266f, 0.267f, -0.683f, 0.29f, -0.976f, 0.073f)
            lineTo(6.72f, 9.775f)
            curveTo(6.453f, 9.51f, 6.43f, 9.092f, 6.647f, 8.8f)
            lineTo(6.72f, 8.715f)
            lineToRelative(4.494f, -4.495f)
            lineTo(6.72f, 8.715f)
            close()
        }
    }.build()
}
