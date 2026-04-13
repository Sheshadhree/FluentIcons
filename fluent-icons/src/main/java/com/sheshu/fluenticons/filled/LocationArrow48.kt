package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LocationArrow48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LocationArrow48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(40.596f, 4.173f)
            curveToRelative(2.022f, -0.778f, 4.008f, 1.209f, 3.23f, 3.23f)
            lineTo(30.369f, 42.397f)
            curveToRelative(-0.871f, 2.264f, -4.134f, 2.085f, -4.751f, -0.262f)
            lineToRelative(-3.93f, -14.932f)
            curveToRelative(-0.114f, -0.436f, -0.455f, -0.776f, -0.89f, -0.89f)
            lineToRelative(-14.933f, -3.93f)
            curveToRelative(-2.347f, -0.618f, -2.526f, -3.88f, -0.261f, -4.752f)
            lineTo(40.596f, 4.173f)
            close()
        }
    }.build()
}
