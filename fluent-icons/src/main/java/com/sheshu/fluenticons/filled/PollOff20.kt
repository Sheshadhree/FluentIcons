package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PollOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PollOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 8.707f)
            verticalLineTo(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-3.293f)
            lineToRelative(2f, 2f)
            verticalLineTo(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            curveToRelative(0.37f, 0f, 0.718f, -0.101f, 1.016f, -0.277f)
            lineToRelative(0.13f, 0.13f)
            curveToRelative(0.196f, 0.196f, 0.512f, 0.196f, 0.708f, 0f)
            curveToRelative(0.195f, -0.195f, 0.195f, -0.511f, 0f, -0.707f)
            lineToRelative(-15f, -15f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineTo(8f, 8.707f)
            close()
            moveTo(14f, 8f)
            verticalLineToRelative(3.879f)
            lineToRelative(4f, 4f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            close()
            moveTo(8f, 5.879f)
            lineToRelative(4f, 4f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            reflectiveCurveTo(8f, 2.895f, 8f, 4f)
            verticalLineToRelative(1.879f)
            close()
            moveTo(4f, 10f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
