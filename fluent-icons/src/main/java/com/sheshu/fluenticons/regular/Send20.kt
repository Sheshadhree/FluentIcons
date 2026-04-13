package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Send20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Send20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.184f, 2.112f)
            curveToRelative(0.153f, -0.124f, 0.364f, -0.147f, 0.54f, -0.06f)
            lineToRelative(15f, 7.5f)
            curveTo(17.893f, 9.638f, 18f, 9.812f, 18f, 10f)
            curveToRelative(0f, 0.19f, -0.107f, 0.363f, -0.276f, 0.447f)
            lineToRelative(-15f, 7.5f)
            curveToRelative(-0.176f, 0.088f, -0.387f, 0.065f, -0.54f, -0.06f)
            curveToRelative(-0.152f, -0.124f, -0.218f, -0.326f, -0.167f, -0.516f)
            lineTo(3.983f, 10f)
            lineTo(2.016f, 2.629f)
            curveToRelative(-0.05f, -0.19f, 0.015f, -0.392f, 0.167f, -0.517f)
            close()
            moveToRelative(2.7f, 8.388f)
            lineTo(3.27f, 16.556f)
            lineTo(16.382f, 10f)
            lineTo(3.269f, 3.444f)
            lineTo(4.884f, 9.5f)
            horizontalLineTo(11.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveToRelative(-0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(4.884f)
            close()
        }
    }.build()
}
