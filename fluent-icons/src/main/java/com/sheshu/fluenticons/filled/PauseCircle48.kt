package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PauseCircle48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PauseCircle48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 44f)
            curveToRelative(11.046f, 0f, 20f, -8.954f, 20f, -20f)
            reflectiveCurveTo(35.046f, 4f, 24f, 4f)
            reflectiveCurveTo(4f, 12.954f, 4f, 24f)
            reflectiveCurveToRelative(8.954f, 20f, 20f, 20f)
            close()
            moveToRelative(-4.75f, -28.5f)
            curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(18f, 31.94f, 18f, 31.25f)
            verticalLineToRelative(-14.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            close()
            moveToRelative(8.25f, 1.25f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveTo(30f, 16.06f, 30f, 16.75f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveToRelative(-1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineToRelative(-14.5f)
            close()
        }
    }.build()
}
