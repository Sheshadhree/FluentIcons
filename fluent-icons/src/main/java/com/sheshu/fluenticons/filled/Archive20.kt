package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Archive20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Archive20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.25f)
            curveTo(2f, 3.56f, 2.56f, 3f, 3.25f, 3f)
            horizontalLineToRelative(13.5f)
            curveTo(17.44f, 3f, 18f, 3.56f, 18f, 4.25f)
            verticalLineToRelative(1.5f)
            curveTo(18f, 6.44f, 17.44f, 7f, 16.75f, 7f)
            horizontalLineTo(3.25f)
            curveTo(2.56f, 7f, 2f, 6.44f, 2f, 5.75f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(3f, 8f)
            horizontalLineToRelative(14f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(8f)
            close()
            moveToRelative(5.5f, 2f)
            curveTo(8.224f, 10f, 8f, 10.224f, 8f, 10.5f)
            reflectiveCurveTo(8.224f, 11f, 8.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 10f, 11.5f, 10f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
