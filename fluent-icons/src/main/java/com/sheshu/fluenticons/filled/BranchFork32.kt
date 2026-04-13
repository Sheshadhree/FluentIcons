package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BranchFork32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BranchFork32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 11.9f)
            curveToRelative(2.282f, -0.463f, 4f, -2.481f, 4f, -4.9f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveTo(4f, 4.239f, 4f, 7f)
            curveToRelative(0f, 2.419f, 1.718f, 4.437f, 4f, 4.9f)
            verticalLineToRelative(8.2f)
            curveToRelative(-2.282f, 0.463f, -4f, 2.481f, -4f, 4.9f)
            curveToRelative(0f, 2.761f, 2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            curveToRelative(0f, -2.419f, -1.718f, -4.437f, -4f, -4.9f)
            verticalLineTo(18f)
            horizontalLineToRelative(9f)
            curveToRelative(2.761f, 0f, 5f, -2.239f, 5f, -5f)
            verticalLineToRelative(-1.1f)
            curveToRelative(2.282f, -0.463f, 4f, -2.481f, 4f, -4.9f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            curveToRelative(0f, 2.419f, 1.718f, 4.437f, 4f, 4.9f)
            verticalLineTo(13f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-9f)
            verticalLineToRelative(-4.1f)
            close()
        }
    }.build()
}
