package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.KeyboardTab24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.KeyboardTab24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.03f, 11.47f)
            lineToRelative(-6.5f, -6.5f)
            curveToRelative(-0.293f, -0.293f, -0.767f, -0.293f, -1.06f, 0f)
            curveToRelative(-0.267f, 0.266f, -0.29f, 0.683f, -0.073f, 0.976f)
            lineTo(10.47f, 6.03f)
            lineToRelative(5.22f, 5.22f)
            horizontalLineTo(3.75f)
            curveToRelative(-0.38f, 0f, -0.693f, 0.282f, -0.743f, 0.648f)
            lineTo(3f, 12f)
            curveToRelative(0f, 0.38f, 0.282f, 0.694f, 0.648f, 0.743f)
            lineTo(3.75f, 12.75f)
            horizontalLineToRelative(11.94f)
            lineToRelative(-5.22f, 5.22f)
            curveToRelative(-0.267f, 0.266f, -0.29f, 0.683f, -0.073f, 0.976f)
            lineToRelative(0.073f, 0.084f)
            curveToRelative(0.266f, 0.267f, 0.683f, 0.29f, 0.976f, 0.073f)
            lineToRelative(0.084f, -0.073f)
            lineToRelative(6.5f, -6.5f)
            curveToRelative(0.267f, -0.266f, 0.29f, -0.683f, 0.073f, -0.976f)
            lineTo(18.03f, 11.47f)
            lineToRelative(-6.5f, -6.5f)
            lineToRelative(6.5f, 6.5f)
            close()
            moveTo(21f, 18.5f)
            verticalLineToRelative(-13f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveTo(19.5f, 5.086f, 19.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveTo(21f, 18.914f, 21f, 18.5f)
            close()
        }
    }.build()
}
