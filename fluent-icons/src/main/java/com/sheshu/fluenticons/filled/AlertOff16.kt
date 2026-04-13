package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlertOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlertOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.293f, 12f)
            lineToRelative(2.853f, 2.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(2.765f, 2.764f)
            curveTo(3.647f, 5.191f, 3.5f, 5.828f, 3.5f, 6.5f)
            verticalLineToRelative(2.401f)
            lineToRelative(-0.964f, 2.414f)
            curveToRelative(-0.062f, 0.154f, -0.043f, 0.328f, 0.05f, 0.465f)
            curveTo(2.679f, 11.918f, 2.834f, 12f, 3f, 12f)
            horizontalLineToRelative(8.293f)
            close()
            moveToRelative(2.171f, -0.685f)
            lineToRelative(0.016f, 0.043f)
            lineToRelative(-8.336f, -8.335f)
            curveTo(5.92f, 2.383f, 6.915f, 2f, 8f, 2f)
            curveToRelative(2.485f, 0f, 4.5f, 2.015f, 4.5f, 4.5f)
            verticalLineToRelative(2.401f)
            lineToRelative(0.964f, 2.414f)
            close()
            moveTo(8f, 14.5f)
            curveToRelative(-0.932f, 0f, -1.715f, -0.637f, -1.937f, -1.5f)
            horizontalLineToRelative(3.874f)
            curveTo(9.715f, 13.863f, 8.932f, 14.5f, 8f, 14.5f)
            close()
        }
    }.build()
}
