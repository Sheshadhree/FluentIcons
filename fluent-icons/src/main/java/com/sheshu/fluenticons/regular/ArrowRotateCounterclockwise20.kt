package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowRotateCounterclockwise20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRotateCounterclockwise20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 10f)
            curveToRelative(0f, -3.866f, -3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            curveToRelative(0f, 2.792f, 1.634f, 5.203f, 4f, 6.326f)
            verticalLineTo(14.5f)
            curveTo(7f, 14.224f, 7.224f, 14f, 7.5f, 14f)
            reflectiveCurveTo(8f, 14.224f, 8f, 14.5f)
            verticalLineToRelative(3f)
            curveTo(8f, 17.776f, 7.776f, 18f, 7.5f, 18f)
            horizontalLineToRelative(-3f)
            curveTo(4.224f, 18f, 4f, 17.776f, 4f, 17.5f)
            reflectiveCurveTo(4.224f, 17f, 4.5f, 17f)
            horizontalLineToRelative(1.624f)
            curveTo(3.665f, 15.636f, 2f, 13.013f, 2f, 10f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(17f, 10.276f, 17f, 10f)
            close()
            moveToRelative(-7f, 2f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            reflectiveCurveToRelative(0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            reflectiveCurveToRelative(-0.895f, 2f, -2f, 2f)
            close()
            moveToRelative(0f, -1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
