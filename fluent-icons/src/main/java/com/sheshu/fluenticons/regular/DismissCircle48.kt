package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DismissCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DismissCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 4f)
            curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
            reflectiveCurveToRelative(-8.954f, 20f, -20f, 20f)
            reflectiveCurveTo(4f, 35.046f, 4f, 24f)
            reflectiveCurveTo(12.954f, 4f, 24f, 4f)
            close()
            moveToRelative(0f, 2.5f)
            curveTo(14.335f, 6.5f, 6.5f, 14.335f, 6.5f, 24f)
            reflectiveCurveTo(14.335f, 41.5f, 24f, 41.5f)
            reflectiveCurveTo(41.5f, 33.665f, 41.5f, 24f)
            reflectiveCurveTo(33.665f, 6.5f, 24f, 6.5f)
            close()
            moveToRelative(-6.218f, 9.525f)
            lineToRelative(0.102f, 0.091f)
            lineTo(24f, 22.233f)
            lineToRelative(6.116f, -6.117f)
            curveToRelative(0.456f, -0.455f, 1.175f, -0.486f, 1.666f, -0.091f)
            lineToRelative(0.102f, 0.091f)
            curveToRelative(0.456f, 0.456f, 0.486f, 1.175f, 0.091f, 1.666f)
            lineToRelative(-0.091f, 0.102f)
            lineTo(25.767f, 24f)
            lineToRelative(6.117f, 6.116f)
            curveToRelative(0.456f, 0.456f, 0.486f, 1.175f, 0.091f, 1.666f)
            lineToRelative(-0.091f, 0.102f)
            curveToRelative(-0.456f, 0.456f, -1.175f, 0.486f, -1.666f, 0.091f)
            lineToRelative(-0.102f, -0.091f)
            lineTo(24f, 25.767f)
            lineToRelative(-6.116f, 6.117f)
            curveToRelative(-0.456f, 0.456f, -1.175f, 0.486f, -1.666f, 0.091f)
            lineToRelative(-0.102f, -0.091f)
            curveToRelative(-0.455f, -0.456f, -0.486f, -1.175f, -0.091f, -1.666f)
            lineToRelative(0.091f, -0.102f)
            lineTo(22.233f, 24f)
            lineToRelative(-6.117f, -6.116f)
            curveToRelative(-0.455f, -0.456f, -0.486f, -1.175f, -0.091f, -1.666f)
            lineToRelative(0.091f, -0.102f)
            curveToRelative(0.456f, -0.455f, 1.175f, -0.486f, 1.666f, -0.091f)
            close()
        }
    }.build()
}
