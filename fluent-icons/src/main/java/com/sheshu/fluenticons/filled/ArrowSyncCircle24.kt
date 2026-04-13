package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowSyncCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSyncCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 12f)
            curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
            reflectiveCurveToRelative(10f, 4.477f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.523f, 2f, 12f)
            close()
            moveToRelative(15.5f, -3.75f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(16f, 7.836f, 16f, 8.25f)
            verticalLineTo(9f)
            curveToRelative(-0.912f, -1.215f, -2.364f, -2f, -4f, -2f)
            curveToRelative(-1.527f, 0f, -2.894f, 0.685f, -3.81f, 1.762f)
            curveToRelative(-0.268f, 0.316f, -0.23f, 0.789f, 0.085f, 1.057f)
            curveToRelative(0.316f, 0.269f, 0.79f, 0.23f, 1.057f, -0.085f)
            curveTo(9.976f, 8.978f, 10.932f, 8.5f, 12f, 8.5f)
            curveToRelative(1.396f, 0f, 2.601f, 0.818f, 3.163f, 2f)
            horizontalLineTo(13.75f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(13.336f, 12f, 13.75f, 12f)
            horizontalLineToRelative(3f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-3f)
            close()
            moveTo(7.25f, 16.5f)
            curveTo(7.664f, 16.5f, 8f, 16.164f, 8f, 15.75f)
            verticalLineTo(15f)
            curveToRelative(0.912f, 1.215f, 2.364f, 2f, 4f, 2f)
            curveToRelative(1.526f, 0f, 2.893f, -0.684f, 3.809f, -1.76f)
            curveToRelative(0.268f, -0.316f, 0.23f, -0.79f, -0.085f, -1.058f)
            curveToRelative(-0.316f, -0.268f, -0.789f, -0.23f, -1.057f, 0.085f)
            curveToRelative(-0.643f, 0.756f, -1.6f, 1.233f, -2.667f, 1.233f)
            curveToRelative(-1.396f, 0f, -2.601f, -0.818f, -3.163f, -2f)
            horizontalLineToRelative(1.413f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.664f, 12f, 10.25f, 12f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
