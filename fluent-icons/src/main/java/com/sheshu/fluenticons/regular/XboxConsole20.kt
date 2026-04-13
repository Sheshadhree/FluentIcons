package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.XboxConsole20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.XboxConsole20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 6.5f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(7.914f, 5f, 7.5f, 5f)
            reflectiveCurveTo(6.75f, 5.336f, 6.75f, 5.75f)
            reflectiveCurveTo(7.086f, 6.5f, 7.5f, 6.5f)
            close()
            moveTo(4f, 2.5f)
            curveTo(4f, 2.224f, 4.224f, 2f, 4.5f, 2f)
            horizontalLineToRelative(11f)
            curveTo(15.776f, 2f, 16f, 2.224f, 16f, 2.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-11f)
            curveTo(4.224f, 18f, 4f, 17.776f, 4f, 17.5f)
            verticalLineToRelative(-15f)
            close()
            moveToRelative(4f, 7f)
            verticalLineTo(17f)
            horizontalLineToRelative(7f)
            verticalLineTo(3f)
            horizontalLineTo(5f)
            verticalLineToRelative(14f)
            horizontalLineToRelative(2f)
            verticalLineTo(9.5f)
            curveTo(7f, 9.224f, 7.224f, 9f, 7.5f, 9f)
            reflectiveCurveTo(8f, 9.224f, 8f, 9.5f)
            close()
        }
    }.build()
}
