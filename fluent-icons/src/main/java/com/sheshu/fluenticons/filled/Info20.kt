package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Info20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Info20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, -4.418f, -3.582f, -8f, -8f, -8f)
            reflectiveCurveToRelative(-8f, 3.582f, -8f, 8f)
            reflectiveCurveToRelative(3.582f, 8f, 8f, 8f)
            reflectiveCurveToRelative(8f, -3.582f, 8f, -8f)
            close()
            moveTo(9.508f, 8.91f)
            curveTo(9.55f, 8.677f, 9.755f, 8.5f, 10f, 8.5f)
            reflectiveCurveToRelative(0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(10.5f, 9f)
            verticalLineToRelative(4.502f)
            lineToRelative(-0.008f, 0.09f)
            curveToRelative(-0.042f, 0.233f, -0.247f, 0.41f, -0.492f, 0.41f)
            reflectiveCurveToRelative(-0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(9.5f, 13.502f)
            verticalLineTo(9f)
            lineToRelative(0.008f, -0.09f)
            close()
            moveTo(9.25f, 6.75f)
            curveTo(9.25f, 6.336f, 9.586f, 6f, 10f, 6f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(10.414f, 7.5f, 10f, 7.5f)
            reflectiveCurveTo(9.25f, 7.164f, 9.25f, 6.75f)
            close()
        }
    }.build()
}
