package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PinOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PinOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(4.75f, 4.75f)
            lineToRelative(-2.878f, 1.15f)
            curveTo(3.352f, 9.021f, 3.175f, 9.882f, 3.683f, 10.39f)
            lineTo(6.293f, 13f)
            lineTo(3f, 16.293f)
            verticalLineTo(17f)
            horizontalLineToRelative(0.707f)
            lineTo(7f, 13.707f)
            lineToRelative(2.61f, 2.61f)
            curveToRelative(0.508f, 0.508f, 1.37f, 0.331f, 1.636f, -0.335f)
            lineToRelative(1.15f, -2.878f)
            lineToRelative(4.75f, 4.75f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-15f, -15f)
            close()
            moveToRelative(14.01f, 7.73f)
            lineTo(13.62f, 11.5f)
            lineTo(8.501f, 6.38f)
            lineToRelative(1.621f, -3.241f)
            curveToRelative(0.61f, -1.221f, 2.238f, -1.485f, 3.203f, -0.52f)
            lineToRelative(4.057f, 4.057f)
            curveToRelative(0.965f, 0.965f, 0.701f, 2.592f, -0.52f, 3.203f)
            close()
        }
    }.build()
}
