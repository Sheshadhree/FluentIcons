package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackAbove28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackAbove28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24.25f, 4.5f)
            curveTo(24.664f, 4.5f, 25f, 4.164f, 25f, 3.75f)
            reflectiveCurveTo(24.664f, 3f, 24.25f, 3f)
            horizontalLineTo(3.75f)
            curveTo(3.336f, 3f, 3f, 3.336f, 3f, 3.75f)
            reflectiveCurveTo(3.336f, 4.5f, 3.75f, 4.5f)
            horizontalLineToRelative(20.5f)
            close()
            moveTo(3f, 17f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(6f)
            horizontalLineTo(3f)
            close()
            moveToRelative(0f, 4.25f)
            verticalLineTo(18.5f)
            horizontalLineToRelative(6.5f)
            verticalLineTo(25f)
            horizontalLineTo(6.75f)
            curveTo(4.679f, 25f, 3f, 23.321f, 3f, 21.25f)
            close()
            moveTo(17f, 25f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(6f)
            verticalLineTo(25f)
            close()
            moveToRelative(4.25f, 0f)
            horizontalLineTo(18.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(25f)
            verticalLineToRelative(2.75f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            close()
            moveTo(24f, 11f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(-6.5f)
            verticalLineToRelative(-6f)
            horizontalLineTo(24f)
            close()
            moveToRelative(-13f, 6f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-6f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(6f)
            close()
        }
    }.build()
}
