package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowPrevious12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowPrevious12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.81f, 6f)
            lineToRelative(2.72f, -2.72f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            lineTo(5.22f, 5.47f)
            curveToRelative(-0.293f, 0.293f, -0.293f, 0.767f, 0f, 1.06f)
            lineToRelative(3.25f, 3.25f)
            curveToRelative(0.293f, 0.293f, 0.767f, 0.293f, 1.06f, 0f)
            curveToRelative(0.293f, -0.293f, 0.293f, -0.767f, 0f, -1.06f)
            lineTo(6.81f, 6f)
            close()
            moveTo(3f, 2.75f)
            curveTo(3f, 2.336f, 2.664f, 2f, 2.25f, 2f)
            reflectiveCurveTo(1.5f, 2.336f, 1.5f, 2.75f)
            verticalLineToRelative(6.5f)
            curveTo(1.5f, 9.664f, 1.836f, 10f, 2.25f, 10f)
            reflectiveCurveTo(3f, 9.664f, 3f, 9.25f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
