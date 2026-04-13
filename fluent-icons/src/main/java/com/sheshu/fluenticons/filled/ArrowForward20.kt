package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowForward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowForward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.22f, 4.78f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(4.5f, 4.5f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(-4.5f, 4.5f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineToRelative(3.22f, -3.22f)
            horizontalLineTo(9.25f)
            curveToRelative(-3.176f, 0f, -5.75f, 2.574f, -5.75f, 5.75f)
            curveTo(3.5f, 15.664f, 3.164f, 16f, 2.75f, 16f)
            reflectiveCurveTo(2f, 15.664f, 2f, 15.25f)
            curveTo(2f, 11.246f, 5.246f, 8f, 9.25f, 8f)
            horizontalLineToRelative(6.19f)
            lineToRelative(-3.22f, -3.22f)
            close()
        }
    }.build()
}
