package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ErrorCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ErrorCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.478f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.522f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0f, 1.667f)
            curveToRelative(-4.595f, 0f, -8.333f, 3.738f, -8.333f, 8.333f)
            curveToRelative(0f, 4.595f, 3.738f, 8.333f, 8.333f, 8.333f)
            curveToRelative(4.595f, 0f, 8.333f, -3.738f, 8.333f, -8.333f)
            curveToRelative(0f, -4.595f, -3.738f, -8.333f, -8.333f, -8.333f)
            close()
            moveToRelative(-0.001f, 10.835f)
            curveToRelative(0.551f, 0f, 0.998f, 0.447f, 0.998f, 0.999f)
            curveToRelative(0f, 0.551f, -0.447f, 0.999f, -0.998f, 0.999f)
            curveToRelative(-0.552f, 0f, -0.999f, -0.448f, -0.999f, -1f)
            curveToRelative(0f, -0.55f, 0.447f, -0.998f, 0.999f, -0.998f)
            close()
            moveTo(11.994f, 7f)
            curveToRelative(0.38f, 0f, 0.694f, 0.282f, 0.744f, 0.648f)
            lineToRelative(0.007f, 0.101f)
            lineToRelative(0.004f, 4.502f)
            curveToRelative(0f, 0.414f, -0.335f, 0.75f, -0.75f, 0.75f)
            curveToRelative(-0.38f, 0f, -0.694f, -0.281f, -0.743f, -0.647f)
            lineToRelative(-0.007f, -0.102f)
            lineToRelative(-0.004f, -4.501f)
            curveToRelative(0f, -0.415f, 0.335f, -0.75f, 0.75f, -0.751f)
            close()
        }
    }.build()
}
