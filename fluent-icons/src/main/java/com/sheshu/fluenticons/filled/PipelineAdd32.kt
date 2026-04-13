package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PipelineAdd32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PipelineAdd32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 6f)
            curveTo(2.895f, 6f, 2f, 6.895f, 2f, 8f)
            verticalLineToRelative(16f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.895f, 2f, -2f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(24f, 0f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(6.512f)
            curveToRelative(1.584f, 0.56f, 2.964f, 1.55f, 4f, 2.83f)
            verticalLineTo(8f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(-5f, 8f)
            curveToRelative(0.338f, 0f, 0.672f, 0.019f, 1f, 0.055f)
            verticalLineTo(9f)
            horizontalLineTo(8f)
            verticalLineToRelative(14f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, -4.97f, 4.03f, -9f, 9f, -9f)
            close()
            moveToRelative(0f, 16.5f)
            curveToRelative(4.142f, 0f, 7.5f, -3.358f, 7.5f, -7.5f)
            curveToRelative(0f, -4.142f, -3.358f, -7.5f, -7.5f, -7.5f)
            curveToRelative(-4.142f, 0f, -7.5f, 3.358f, -7.5f, 7.5f)
            curveToRelative(0f, 4.142f, 3.358f, 7.5f, 7.5f, 7.5f)
            close()
            moveToRelative(1f, -12.25f)
            verticalLineTo(22f)
            horizontalLineToRelative(3.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(24f)
            verticalLineToRelative(3.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineTo(23.5f)
            horizontalLineToRelative(-3.75f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(18.336f, 22f, 18.75f, 22f)
            horizontalLineToRelative(3.75f)
            verticalLineToRelative(-3.75f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            reflectiveCurveTo(24f, 17.836f, 24f, 18.25f)
            close()
        }
    }.build()
}
