package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoClipOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoClipOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.195f, 12.902f)
            lineToRelative(1.951f, 1.952f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(1.739f, 1.738f)
            curveTo(2.344f, 4.05f, 2f, 4.735f, 2f, 5.5f)
            verticalLineToRelative(5f)
            curveTo(2f, 11.88f, 3.12f, 13f, 4.5f, 13f)
            horizontalLineToRelative(7f)
            curveToRelative(0.241f, 0f, 0.474f, -0.034f, 0.695f, -0.098f)
            close()
            moveTo(8.699f, 9.406f)
            lineToRelative(-1.712f, 1.046f)
            curveTo(6.774f, 10.583f, 6.5f, 10.43f, 6.5f, 10.18f)
            verticalLineTo(7.207f)
            lineToRelative(2.199f, 2.2f)
            close()
            moveToRelative(1.547f, -1.867f)
            curveToRelative(0.272f, 0.167f, 0.33f, 0.514f, 0.171f, 0.757f)
            lineToRelative(3.32f, 3.32f)
            curveTo(13.905f, 11.28f, 14f, 10.901f, 14f, 10.5f)
            verticalLineToRelative(-5f)
            curveTo(14f, 4.12f, 12.88f, 3f, 11.5f, 3f)
            horizontalLineTo(5.121f)
            lineTo(8.74f, 6.619f)
            lineToRelative(1.506f, 0.92f)
            close()
        }
    }.build()
}
