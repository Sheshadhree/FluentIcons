package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Info20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Info20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.492f, 8.91f)
            curveTo(10.45f, 8.677f, 10.246f, 8.5f, 10f, 8.5f)
            curveTo(9.724f, 8.5f, 9.5f, 8.724f, 9.5f, 9f)
            verticalLineToRelative(4.502f)
            lineToRelative(0.008f, 0.09f)
            curveToRelative(0.043f, 0.233f, 0.247f, 0.41f, 0.492f, 0.41f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(9f)
            lineToRelative(-0.008f, -0.09f)
            close()
            moveTo(10.8f, 6.75f)
            curveTo(10.8f, 6.336f, 10.464f, 6f, 10.05f, 6f)
            reflectiveCurveTo(9.3f, 6.336f, 9.3f, 6.75f)
            reflectiveCurveTo(9.636f, 7.5f, 10.05f, 7.5f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            close()
            moveTo(18f, 10f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            close()
            moveTo(3f, 10f)
            curveToRelative(0f, -3.866f, 3.134f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            close()
        }
    }.build()
}
