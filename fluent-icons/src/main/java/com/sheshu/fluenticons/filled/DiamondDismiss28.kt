package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DiamondDismiss28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DiamondDismiss28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.098f, 16.651f)
            curveToRelative(-1.464f, -1.464f, -1.464f, -3.838f, 0f, -5.303f)
            lineToRelative(8.25f, -8.25f)
            curveToRelative(1.465f, -1.464f, 3.839f, -1.464f, 5.303f, 0f)
            lineToRelative(8.25f, 8.25f)
            curveToRelative(1.465f, 1.465f, 1.465f, 3.839f, 0f, 5.303f)
            lineToRelative(-8.25f, 8.25f)
            curveToRelative(-1.464f, 1.465f, -3.838f, 1.465f, -5.303f, 0f)
            lineToRelative(-8.25f, -8.25f)
            close()
            moveTo(10.78f, 9.72f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineTo(12.94f, 14f)
            lineToRelative(-3.22f, 3.22f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            lineTo(14f, 15.06f)
            lineToRelative(3.22f, 3.22f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(15.06f, 14f)
            lineToRelative(3.22f, -3.22f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(14f, 12.94f)
            lineToRelative(-3.22f, -3.22f)
            close()
        }
    }.build()
}
