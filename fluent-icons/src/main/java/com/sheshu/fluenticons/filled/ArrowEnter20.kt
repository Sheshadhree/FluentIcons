package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowEnter20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowEnter20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 17.5f)
            curveTo(7.336f, 17.5f, 7f, 17.164f, 7f, 16.75f)
            reflectiveCurveTo(7.336f, 16f, 7.75f, 16f)
            horizontalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(7.75f)
            curveTo(7.336f, 4f, 7f, 3.664f, 7f, 3.25f)
            reflectiveCurveTo(7.336f, 2.5f, 7.75f, 2.5f)
            horizontalLineTo(14f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            horizontalLineTo(7.75f)
            close()
            moveTo(7.741f, 6.199f)
            curveToRelative(0.305f, -0.281f, 0.78f, -0.262f, 1.06f, 0.042f)
            lineToRelative(3f, 3.25f)
            curveToRelative(0.265f, 0.288f, 0.265f, 0.73f, 0f, 1.018f)
            lineToRelative(-3f, 3.25f)
            curveToRelative(-0.28f, 0.304f, -0.755f, 0.323f, -1.06f, 0.042f)
            curveToRelative(-0.304f, -0.28f, -0.323f, -0.755f, -0.042f, -1.06f)
            lineToRelative(1.838f, -1.991f)
            horizontalLineTo(1.75f)
            curveTo(1.336f, 10.75f, 1f, 10.414f, 1f, 10f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(7.787f)
            lineTo(7.699f, 7.259f)
            curveToRelative(-0.281f, -0.305f, -0.262f, -0.78f, 0.042f, -1.06f)
            close()
        }
    }.build()
}
