package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowExit20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowExit20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.25f, 17.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(12.664f, 16f, 12.25f, 16f)
            horizontalLineTo(6f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(6.25f)
            curveTo(12.664f, 4f, 13f, 3.664f, 13f, 3.25f)
            reflectiveCurveTo(12.664f, 2.5f, 12.25f, 2.5f)
            horizontalLineTo(6f)
            curveTo(4.067f, 2.5f, 2.5f, 4.067f, 2.5f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.933f, 1.567f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(6.25f)
            close()
            moveToRelative(1.491f, -11.301f)
            curveToRelative(0.305f, -0.281f, 0.78f, -0.262f, 1.06f, 0.042f)
            lineToRelative(3f, 3.25f)
            curveToRelative(0.265f, 0.288f, 0.265f, 0.73f, 0f, 1.018f)
            lineToRelative(-3f, 3.25f)
            curveToRelative(-0.28f, 0.304f, -0.755f, 0.323f, -1.06f, 0.042f)
            curveToRelative(-0.304f, -0.28f, -0.323f, -0.755f, -0.042f, -1.06f)
            lineToRelative(1.838f, -1.991f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 10.75f, 7f, 10.414f, 7f, 10f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(7.787f)
            lineToRelative(-1.838f, -1.991f)
            curveToRelative(-0.281f, -0.305f, -0.262f, -0.78f, 0.042f, -1.06f)
            close()
        }
    }.build()
}
