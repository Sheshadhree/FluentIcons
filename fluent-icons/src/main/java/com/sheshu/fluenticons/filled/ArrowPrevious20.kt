package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowPrevious20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowPrevious20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 4.75f)
            curveToRelative(-0.38f, 0f, -0.694f, 0.282f, -0.743f, 0.648f)
            lineTo(5.25f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.648f)
            lineTo(6.75f, 14.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
            moveToRelative(8.28f, 0.22f)
            curveToRelative(-0.266f, -0.267f, -0.683f, -0.29f, -0.976f, -0.073f)
            lineTo(13.22f, 4.97f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.267f, 0.266f, -0.29f, 0.683f, -0.073f, 0.976f)
            lineTo(8.72f, 10.53f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.267f, -0.266f, 0.29f, -0.683f, 0.073f, -0.976f)
            lineTo(14.28f, 13.97f)
            lineTo(10.31f, 10f)
            lineToRelative(3.97f, -3.97f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
        }
    }.build()
}
