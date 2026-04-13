package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowPrevious24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowPrevious24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.75f, 3f)
            curveTo(5.37f, 3f, 5.056f, 3.282f, 5.007f, 3.648f)
            lineTo(5f, 3.75f)
            verticalLineToRelative(16.5f)
            curveTo(5f, 20.664f, 5.336f, 21f, 5.75f, 21f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.648f)
            lineTo(6.5f, 20.25f)
            verticalLineTo(3.75f)
            curveTo(6.5f, 3.336f, 6.164f, 3f, 5.75f, 3f)
            close()
            moveToRelative(13.03f, 0.22f)
            curveToRelative(-0.266f, -0.267f, -0.683f, -0.29f, -0.976f, -0.073f)
            lineTo(17.72f, 3.22f)
            lineToRelative(-8.25f, 8.25f)
            curveToRelative(-0.267f, 0.266f, -0.29f, 0.683f, -0.073f, 0.976f)
            lineTo(9.47f, 12.53f)
            lineToRelative(8.25f, 8.25f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.267f, -0.266f, 0.29f, -0.683f, 0.073f, -0.976f)
            lineTo(18.78f, 19.72f)
            lineTo(11.06f, 12f)
            lineToRelative(7.72f, -7.72f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            close()
        }
    }.build()
}
