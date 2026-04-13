package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSortDown20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSortDown20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.75f, 17f)
            curveToRelative(0.235f, 0f, 0.452f, -0.108f, 0.59f, -0.278f)
            lineToRelative(2.94f, -2.946f)
            curveToRelative(0.293f, -0.292f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.292f, -0.293f, -0.766f, -0.293f, -1.058f, 0f)
            lineTo(10.5f, 14.434f)
            verticalLineTo(3.75f)
            curveTo(10.5f, 3.336f, 10.164f, 3f, 9.75f, 3f)
            reflectiveCurveTo(9f, 3.336f, 9f, 3.75f)
            verticalLineToRelative(10.694f)
            lineToRelative(-1.722f, -1.733f)
            curveToRelative(-0.292f, -0.293f, -0.766f, -0.293f, -1.059f, 0f)
            curveToRelative(-0.292f, 0.293f, -0.292f, 0.768f, 0f, 1.061f)
            lineToRelative(3.004f, 3.008f)
            curveTo(9.37f, 16.928f, 9.557f, 17.001f, 9.75f, 17f)
            close()
        }
    }.build()
}
