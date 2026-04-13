package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.XboxConsole20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.XboxConsole20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 2f)
            curveTo(4.224f, 2f, 4f, 2.224f, 4f, 2.5f)
            verticalLineToRelative(15f)
            curveTo(4f, 17.776f, 4.224f, 18f, 4.5f, 18f)
            horizontalLineTo(7f)
            verticalLineTo(9.5f)
            curveTo(7f, 9.224f, 7.224f, 9f, 7.5f, 9f)
            reflectiveCurveTo(8f, 9.224f, 8f, 9.5f)
            verticalLineTo(18f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-15f)
            curveTo(16f, 2.224f, 15.776f, 2f, 15.5f, 2f)
            horizontalLineToRelative(-11f)
            close()
            moveToRelative(3f, 4.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(7.086f, 5f, 7.5f, 5f)
            reflectiveCurveToRelative(0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(7.914f, 6.5f, 7.5f, 6.5f)
            close()
        }
    }.build()
}
