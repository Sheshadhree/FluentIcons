package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepOver16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepOver16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.146f, 2.147f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineTo(12.293f, 5f)
            horizontalLineTo(9.957f)
            curveTo(8.49f, 5f, 7.052f, 5f, 5.731f, 5.396f)
            curveTo(4.366f, 5.806f, 3.146f, 6.63f, 2.084f, 8.223f)
            curveToRelative(-0.153f, 0.23f, -0.091f, 0.54f, 0.139f, 0.693f)
            curveToRelative(0.23f, 0.153f, 0.54f, 0.091f, 0.693f, -0.139f)
            curveTo(3.854f, 7.37f, 4.885f, 6.694f, 6.02f, 6.354f)
            curveTo(7.185f, 6.004f, 8.483f, 6f, 10f, 6f)
            horizontalLineToRelative(2.293f)
            lineToRelative(-2.146f, 2.146f)
            curveToRelative(-0.196f, 0.196f, -0.196f, 0.512f, 0f, 0.707f)
            curveToRelative(0.195f, 0.196f, 0.511f, 0.196f, 0.707f, 0f)
            lineToRelative(3f, -3f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-3f, -3f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.707f, 0f)
            close()
            moveTo(8f, 15f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            curveToRelative(-1.104f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.896f, 2f, 2f, 2f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            close()
        }
    }.build()
}
