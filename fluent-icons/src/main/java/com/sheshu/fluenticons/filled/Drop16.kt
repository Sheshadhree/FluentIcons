package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Drop16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Drop16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.646f, 1.147f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            curveToRelative(0.261f, 0.261f, 1.408f, 1.45f, 2.493f, 3.002f)
            curveTo(11.917f, 5.68f, 13f, 7.665f, 13f, 9.5f)
            curveToRelative(0f, 1.78f, -0.577f, 3.165f, -1.516f, 4.105f)
            curveTo(10.549f, 14.542f, 9.291f, 15f, 8f, 15f)
            reflectiveCurveToRelative(-2.548f, -0.458f, -3.484f, -1.395f)
            curveTo(3.577f, 12.665f, 3f, 11.281f, 3f, 9.5f)
            curveToRelative(0f, -1.835f, 1.083f, -3.82f, 2.153f, -5.35f)
            curveToRelative(1.085f, -1.554f, 2.232f, -2.742f, 2.494f, -3.004f)
            close()
        }
    }.build()
}
